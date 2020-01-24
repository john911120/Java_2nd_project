package File_Directory;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/*
    운영체제의 파일 시스템은 FileSystem 인터페이스를 통해서 얻을 수 있다.
    - FileSystem 구현 객체는 FileSystems의 정적 메소드인 getDefault()로 얻는 것이 가능하다.
    - 작성일 : 0120
 */

public class Get_File_System_Info {
    public static void main(String[] args) throws Exception {
        FileSystem fileSystem = FileSystems.getDefault();
        for(FileStore store : fileSystem.getFileStores()) {
            System.out.println("드라이버 이름 : " + store.name());
            System.out.println("파일 시스템 : " + store.type());
            System.out.println("전체 공간 : " + store.getTotalSpace() + "Byte");
            System.out.println("사용 중인 공간 : " +
                    (store.getTotalSpace() - store.getUnallocatedSpace()) + "Byte");
            System.out.println("사용 가능 공간 :"  + store.getUsableSpace() + "Byte");
            System.out.println();
        }

        System.out.println("파일 구분자 : " + fileSystem.getSeparator());
        System.out.println();

        for(Path path : fileSystem.getRootDirectories()){
            System.out.println(path.toString());
        }
    }
}
