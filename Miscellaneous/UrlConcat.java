package Miscellaneous;
import java.util.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
class UrlConcat
{
    public static void main(String args[])
    {
        System.out.println("\nAfter Each Entry is completed, final result is copied to your clipboard");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Base URL :");
        String base_url = sc.nextLine();
        String para = "";
        for(int j=0;j<n;j++)
        {
            System.out.println("Enter URL : ");
            String url = sc.nextLine();
            int base_url_length = base_url.length();
            int url_length = url.length();
            String name = "";
            for(int i=base_url_length+1;i<url_length;i++)
            {
                name = name + url.charAt(i);
            }
            name = name.replace("%20"," ");
            String point = "• ";
            String start_tag = ("<a href=\""+url+"\">");
            String end_tag = ("</a>");
            String link = start_tag+name+end_tag;
            int space_length = 30-name.length();
            String space = "";
            for(int i=0;i<space_length;i++)
            {
                space = space + " ";
            }
            System.out.println("Enter Your message here : ");
            String message = sc.nextLine();
            message = ("| " + message);
            String end = (".");
            String final_result = point+link+space+message+end;
            System.out.println(final_result);
            para = (para + final_result+ "\n");
            StringSelection stringSelection = new StringSelection(final_result);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
        System.out.println("\nFinal Paragraph has been copied to your clipboard\n");
        System.out.println(para);
        StringSelection stringSelection = new StringSelection(para);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}