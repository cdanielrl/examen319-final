import org.apache.spark.sql.SparkSession                            // Import de librería necesario
import org.apache.spark.sql.Dataset                                 // Import de librería necesario
import org.apache.spark.sql.DataFrame                               // Import de librería necesario

val spark: SparkSession = SparkSession.builder()                    // Crea una nueva sesión de Spark en la instancia local con el nombre "simple-app"
    .master("local[*]")
    .appName("simple-app")
    .getOrCreate()
    
val dataSet: Dataset[String] = spark.read.textFile("textfile.csv")  // Abre el archivo "textfile.csv" dentro de la sesion de Spark creada y lo carga en un objeto DataSet (en estee ejemplo usamos el conjunto de datoss iris)
val df: DataFrame = dataSet.toDF()                                  // Convierte el dataset a un DataFrame y lo guarda en el objeto df
