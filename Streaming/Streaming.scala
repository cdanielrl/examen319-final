import org.apache.spark.streaming.StreamingContext                                              // Import de librería necesario
import org.apache.spark.streaming.dstream.ReceiverInputDStream                                  // Import de librería necesario
import org.apache.spark.streaming.Seconds                                                       // Import de librería necesario

//val streamingContext: StreamingContext = new StreamingContext(sparkContext, Seconds(20))      // Creamos un contexto de Streaming, pero no existe el contexto sparkContext
val streamingContext: StreamingContext = new StreamingContext(sc, Seconds(20))                  // Creamos un contexto de Streaming usando el contexto de spark generado automáticamente "sc"  que trabaja sobre lotes de datos cada 20 segundos
val lines: ReceiverInputDStream[String] = streamingContext.socketTextStream("localhost", 9999)  // Creamos un steam que recibe datos en el puerto 9999
