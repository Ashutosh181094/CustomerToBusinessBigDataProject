import org.apache.spark.sql.SparkSession

object Test {

  def main(args: Array[String]): Unit = {
     val spark=SparkSession.builder()
       .master("local")
       .appName("First")
       .getOrCreate()


  }

}
