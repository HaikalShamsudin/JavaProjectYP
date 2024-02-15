package Day7.Example4;

abstract class ReadFileHandler {

    //declare the variable
    private String filename;

    //make a constructor (CONSTRUCTOR MUST SAME NAME AS CLASS)
    public ReadFileHandler (String fileName){
        this.filename = fileName;
    }
    
    //make a function to return
    public String getFileName() {
        return this.filename;
    }
    

}
