package br.com.feature.java13;

/**
 *  Reimplementar a API de soquete herdada (JEP 353)
 * Vimos as APIs Socket (java.net.Socket e java.net.ServerSocket) como parte integrante do Java desde o seu início.
 * No entanto, eles nunca foram modernizados nos últimos vinte anos.
 * Escrito em Java e C legados, eles eram complicados e difíceis de manter.
 *
 * O Java 13 resistiu a essa tendência e substituiu a implementação subjacente para alinhar a API com os
 * encadeamentos futurísticos do modo de usuário. Em vez de PlainSocketImpl, a interface do provedor agora aponta para NioSocketImpl.
 * Essa implementação recém-codificada é baseada na mesma infraestrutura interna do java.nio.
 *
 * Novamente, temos uma maneira de voltar a usar PlainSocketImpl. Podemos iniciar a JVM com a propriedade do
 * sistema -Djdk.net.usePlainSocketImpl definida como true para usar a implementação mais antiga. O padrão é NioSocketImpl.
 *
 */

/**
 * ZGC: Liberar memória não utilizada (JEP 351)
 * O Z Garbage Collector foi introduzido no Java 11 como um mecanismo de coleta de lixo de baixa latência, de modo que os tempos de
 * pausa do GC nunca excedam 10 ms. No entanto, ao contrário de outros GCs HotSpot VM, como G1 e Shenandoah,
 * ele não foi equipado para retornar a memória heap não utilizada para o sistema operacional. O Java 13 adicionou esse recurso ao ZGC.
 *
 * Agora obtemos uma pegada de memória reduzida junto com melhoria de desempenho.
 *
 * A partir do Java 13, o ZGC agora retorna a memória não confirmada para o sistema operacional por padrão,
 * até que o tamanho de heap mínimo especificado seja atingido. Se não quisermos usar esse recurso, podemos voltar ao modo Java 11:
 *
 * Usando a opção -XX:-ZUncommit, ou
 * Configurando tamanhos de heap mínimos (-Xms) e máximos (-Xmx) iguais
 * Além disso, o ZGC agora tem um tamanho máximo de heap suportado de 16 TB. Anteriormente, 4 TB era o limite.
 *
 *  Introduzido JDK 11 (apenas Linux / x64);
 *  Escalável e baixa latência (<= 10ms);
 *
 *  $ hg clone http://hg.openjdk.java.net/jdk/jdk
 *  $ cd zgc
 *  $ sh configure --with-jvm-features=zgc
 *  $ make images
 *
 *  Realocação do Heap. (JDK 13)
 */