package File_Directory;

/*
    상대경로를 사용해서 소스 파일에 대한 Path객체를 얻어서 파일명, 부모 디렉토리명, 중첩 경로 수
    경로 상에 있는 모든 디렉토리를 출력한다.
    - 작성일 : 0120
 */

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class Using_Path_Interface{
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/File_Directory/Using_Path_Interface.java");
        System.out.println("[파일명]" + path.getFileName());
        System.out.println("[부모 디렉토리명]" + path.getParent().getFileName());
        System.out.println("중첩 경로수:" + path.getNameCount());

        System.out.println();
        for(int i = 0; i <path.getNameCount(); i++){
            System.out.println(path.getName(i));
        }

        System.out.println();
        Iterator<Path> iterator = path.iterator();
        while(iterator.hasNext()){
            Path temp = iterator.next();
            System.out.println(temp.getFileName());
        }
    }
}
