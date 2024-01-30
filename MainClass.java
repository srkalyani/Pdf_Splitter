import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException {
        File oldFile=new File("D:\\pdf\\input.pdf ");
        PDDocument document=PDDocument.load(oldFile);
        Splitter splitter=new Splitter();
        List<PDDocument>splitPages=splitter.split(document);

        int num=1;
        for(PDDocument mydocs:splitPages)
        {
            mydocs.save("D:\\pdf\\output\\split_0"+num+".pdf");
            num++;
            mydocs.close();
        }
        System.out.println("split Done");
    }
}
