package File_Directory;

/*
    디렉토리와 파일을 생성하고 디렉토리의 내용을 출력하는 소스코드이다.
    - 경로상에 존재하지 않는 모든 디렉토리를 생성하고
    - 파일을 만들고 디렉토리 내용을 스트림으로 얻어온다.
    작성일 : 0120
 */

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExample {
    public static void main(String[] args) throws Exception {
        Path path1 = Paths.get("C:/Temp/dir/subdir");
        Path path2 = Paths.get("C:/Temp/dir/file.txt");

        if(Files.notExists(path1)){
            Files.createDirectories(path1);
        }

        if(Files.notExists(path2)){
            Files.createDirectories(path2);
        }

        Path path3 = Paths.get("C:/Temp");
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path3);
        for(Path path : directoryStream) {
            if(Files.isDirectory(path)) {
                System.out.println("[디렉토리] : " + path.getFileName());
            } else {
                System.out.println("[파일] : " + path.getFileName() + "(크기:" + Files.size(path) + ")");
            }
        }
    }
}
