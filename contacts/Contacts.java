
//
//package contacts;
//        import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//        import java.nio.file.Paths;
//        import java.nio.file.StandardOpenOption;
//        import java.util.ArrayList;
//        import java.util.Arrays;
//        import java.util.List;
//
//public class Contacts {
//    private      String name;
//    private String number;
//    //
//    public String getName () {
//        return name;
//    }
//    //
//    public void setName (String name){
//        this.name = name;
//    }
//    //
//    public String getNumber () {
//        return number;
//    }
//    //
//    public void setNumber (String number){
//        this.number = number;
//    }
//    //
//    public Contacts(String name, String number) {
//        this.name = name;
//        this.number = number;
//    }
//
//
////    public static void main(String[] args) {
//
//
//    String directory = "data";
//    String filename = "contacts.txt";
//
//
//        try {
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if(Files.notExists(dataDirectory)) {
//            System.out.println("Creating new directory named: " + dataDirectory);
//
//            Files.createDirectories(dataDirectory);
//        }
//
//        if(!Files.exists(dataFile)) {
//            System.out.println("Your new file has been created!");
//
//            Files.createFile(dataFile);
//        }
//
//        List<String> dataText = new ArrayList<>();
//        dataText.add("Athena","210-567-3678");
//        dataText.add("Medusa");
//        dataText.add("Hades");
//        dataText.add("Aphrodite");
//        dataText.add("Artemis");
//        dataText.add("Ares");
//        dataText.add("Zeus");
//
//        if(Files.exists(dataFile)) {
//            System.out.println("Writing to info.txt file!");
//            Files.write(dataFile, dataText);
//            Files.write(dataFile, Arrays.asList("Apollo", "Gaia"), StandardOpenOption.APPEND);
//
//            System.out.println(dataText);
//        }
//    } catch(IOException iox) {
//        iox.printStackTrace();
//    }
//
//
//        try {
//        List<String> fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));
//        System.out.println(fileData);
//
//        List<String> newList = new ArrayList<>();
//
//        for (String god : fileData) {
//            if(god.equals("Deimos")) {
//                continue;
//            }
//            newList.add(god);
//        }
//        Files.write(Paths.get("data", "contacts.txt"), newList);
//        fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));
//        for (String line: fileData) {
//            System.out.println(line);
//        }
//
//    } catch( IOException iox) {
//        iox.printStackTrace();
//    }
//
