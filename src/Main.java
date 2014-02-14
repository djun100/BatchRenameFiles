import java.io.File;


public class Main {

	public static void main(String[] args) {
		reNameMp3();
}
	public static void reNameMp3(){ 
        File file = new File("C://Users//Administrator//Desktop//LiveTV_icon");        
        if(file.isDirectory()){ 
            File[] files = file.listFiles(); 
            for(int i=0; i<files.length; i++){ 
             System.out.println(files[i].getAbsolutePath());//包括了文件名

       // 输出为：d:/明朝那些事儿11（朱常洛篇）MP3有声版/明朝那些事儿11(朱常洛篇)01-YSXS8.COM.mp3

      // 而我们需要只要路径，然后将文件名进行适当的截取。因此需要用fiiles[i].getParent()     


                String fileNameWithPath = files[i].getParent() 
                                            + "//" + files[i].getName()
                                            + ".jpg"; 
                System.out.println(fileNameWithPath); 
                boolean flag = files[i].renameTo(new File(fileNameWithPath)); 
                System.out.println(flag); 
            } 
        }        
    }
}