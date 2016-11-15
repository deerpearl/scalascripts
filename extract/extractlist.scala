import scala.io.Source
import java.io._


using(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")))) { 
  writer =>
    for (line <- Source.fromFile(args(0)).getLines)
    if ((line.toLowerCase() contains "chinese") || (line.toLowerCase() contains "scroll")){
    	print(line.length +" "+ line + "\n")
    	writer.write(line+ System.lineSeparator)
    }
    
	
}

def using[T <: Closeable, R](resource: T)(block: T => R): R = {
  try { block(resource) }
  finally { resource.close() }
}

