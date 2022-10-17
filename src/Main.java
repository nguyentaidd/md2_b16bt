import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File(
                    "D:\\MD-2\\Bai-16\\Bai Tap\\BaiTap1\\src\\sourceFile.txt"));
            outputStream = new FileOutputStream(new File(
                    "D:\\MD-2\\Bai-16\\Bai Tap\\BaiTap1\\src\\targetFile.txt"));

            byte[] buffer = new byte[1000];
            int length = inputStream.read(buffer);
            while (length > 0) {
                outputStream.write(buffer, 0, length);
            }
            System.out.println("File copy thanh cong !");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}