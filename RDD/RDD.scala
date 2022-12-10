val cadenas = Array("Docentes", "inteligenciaArtificial", "quefinal")   // Crea un Array con tres cadenas
val cadenasRDD = sc . parallelize (cadenas)                             // Convierte el array de cadenas en una colección que se puede trabajar en paralelo
cadenasRDD.collect()                                                    // Recopila los datos de la colección en paralelo
file.collect()                                                          // Iintenta recopilar los datos de un objeto "file" que no existe
val filtro = cadenasRDD.filter(line => line.contains("quefinal"))       // Filtra los elemenos de la colección que contienen la cadena "quefinal"
val fileNotFound = sc.textFile("/7añljdlsjd/alkls/", 6)                 // abre una referencia al archivo "/7añljdlsjd/alkls/" dentro del contexto por defecto "sc" de Spark, pero el archivo no existe
fileNotFound.collect()                                                  // Intenta recopilar los datos del un objeto "fileNotFound" que no existe
