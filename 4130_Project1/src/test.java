import opennlp.tools.stemmer.PorterStemmer;
public class test {
	
	public static void main(String[] args)
	{
		PorterStemmer stemmer = new PorterStemmer();
		System.out.println(stemmer.stem("hello"));
	}

}
