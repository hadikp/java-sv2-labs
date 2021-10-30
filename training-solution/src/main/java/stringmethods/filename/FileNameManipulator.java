package stringmethods.filename;


public class FileNameManipulator {
    public char findLastCharacter(String str) {
        return  str.charAt(str.length()-1);
    }

    int pointNum;
    public int findFileExtension(String fileName) {
        String[] fileSplit = fileName.split("");

        for (String f: fileSplit) {
            if (".".equals(f)) {
              pointNum = fileName.indexOf(f);
            }
        } return pointNum;
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        int pointNumber = findFileExtension(fileName);
        if (fileName.substring(pointNumber + 1).equals(ext)) {
            return true;
        }
       return false;
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.equals(actualFileName);
    }

    public String  changeExtensionToLowerCase (String fileName) {
        int pointNumber = findFileExtension(fileName);
        String extNow = fileName.substring(pointNumber + 1);
        String extToLowercase = fileName.substring(pointNumber + 1).toLowerCase();
        fileName = replaceStringPart(fileName, extNow, extToLowercase);
        return fileName;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present, target);
    }

    public static void main(String[] args) {
        FileNameManipulator file = new FileNameManipulator();
       // System.out.println("A szónak az utolsó karaktere: " + file.findLastCharacter("bzzzk"));

        System.out.print("A file kiterjesztése: ");
        int substringNum = file.findFileExtension("word.exe");
        System.out.println("word.exe".substring(substringNum + 1));

        String fileExt = "pdf";
        System.out.print("A megadott file kiterjesztése " + fileExt + ": ");
        System.out.println(file.identifyFilesByExtension(fileExt, "word11.pdf"));

        System.out.println("A két file neve megegyezik: " + file.compareFilesByName("file2", "file"));

        System.out.println("A nagybetűvel írt file kiterjesztés kisbetűsre cserélése: " + file.changeExtensionToLowerCase("word.EXE"));

        System.out.println(file.replaceStringPart("word file", "wo", "ho"));
    }
}
