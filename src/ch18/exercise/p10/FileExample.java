package ch18.exercise.p10;

import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String originalPath = "";
        String targetPath = "";

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        try (ir; br) {
            System.out.print("원본 파일 경로: ");
            originalPath = br.readLine();
            System.out.print("복사 파일 경로: ");
            targetPath = br.readLine();

            File originalFile = new File(originalPath);

            if (originalFile.exists()) {
                File targetFile = new File(targetPath);
                File targetFolder = targetFile.getParentFile();
                if (!targetFolder.exists()) {
                    targetFolder.mkdirs();
                }

                InputStream is = new FileInputStream(originalFile);
                OutputStream os = new FileOutputStream(targetFile);
                BufferedInputStream bis = new BufferedInputStream(is);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (is; os; bis; bos) {
                    byte[] data = new byte[1024];
                    int len;
                    while ((len = bis.read(data)) != -1) {
                        bos.write(data, 0, len);
                    }
                    System.out.println("복사가 성공되었습니다.");
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");
            }
            //원본 파일 경로: temp/dir1/photo1.jpg
            //복사 파일 경로: temp/dir2/photo2.jpg
        }
    }
}
