package Practise;

import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

public class AutoitApi {
public static void main(String[] args)
{

System.setProperty(LibraryLoader.JACOB_DLL_PATH,"C:\\Users\\bobby\\Desktop\\selenium dump\\jacob-1.17\\jacob-1.17-x86.dll");

AutoItX x = new AutoItX();

x.run("Notepad.exe");
x.winWaitActive("Untitled - Notepad");
//Verify note pad window
if (x.winExists("Untitled - Notepad"));
{
System.out.println("Notepad displayed");
}
//x.winActivate(Untitled - Notepad);
x.send("Good morning");
x.winClose("Untitled - Notepad");
}
}