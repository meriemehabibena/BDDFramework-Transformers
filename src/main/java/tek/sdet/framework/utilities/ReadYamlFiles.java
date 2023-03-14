package tek.sdet.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	private static ReadYamlFiles readYamFiles;
	private HashMap propertyMap;
	private ReadYamlFiles(String filepath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);
		Yaml yaml = new Yaml();
		this.propertyMap = yaml.load(fileInputStream);
	}
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException{
		if(readYamFiles == null)
			return new ReadYamlFiles(filePath);
		return readYamFiles;
	}
	public HashMap getYamlPropperty(String Key) {
		return (HashMap) this.propertyMap.get(Key);
	}
}
	