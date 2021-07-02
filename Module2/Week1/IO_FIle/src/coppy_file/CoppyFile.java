import java.io.*;


class CoppyFile {

    public static void main(String[] args) throws IOException {
        File source = new File("src\\number.txt");
        File dest = new File("src\\text2.txt");
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(dest);
        try {

            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer,0,length);
            }
            System.out.println("File is copied successful!");
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }


    }
}
