import java.util.*;

public class Report {

  public static void main(String[] args) {
    RunReport doiReport = new RunReport("DOI Report");
    System.out.print(doiReport);
  }
}

public class RunReport {
  private String message;

  public RunReport(String input) {
    buildDocument();
    message = "Report finshed " + input;
  }

  private void buildDocument() {
    Row row = new Row();
    Cell cell = new Cell();
    String fontName = "Times New Roman";
    int fontSize = 12;
    cell.setFont(fontName, fontSize);
    String horizontalAlignment = "Center";
    cell.setAlignment(horizontalAlignment);
    String verticalAlignment = "Center";
    cell.setVerticalAlignment(verticalAlignment);

    boolean bold = true;
    boolean italic = false;
    boolean underlined = false;

    cell.setBold(bold);
    cell.setItalic(italic);
    cell.setUnderlined(underlined);

    row.addCell(cell);

    // The above needs to be ran for every cell in our row and there will be many rows with many cells. How would you handle this?
    /*

      ------Your code here-----

    */

    //The fontSize and fontName do not change throughout the report, how would you change the code above now that you are given this information?
  }

  public String toString() {
    return message;
  }
}

public class Cell {
  String fontName;
  int fontSize;
  String verticalAlignment, horizonalAlignment;
  boolean bold, italic, underlined;

  public void setFont(String fontName, int fontSize) {
    this.fontName = fontName;
    this.fontSize = fontSize;
  }

  public void setUnderlined(boolean underlined) {
    this.underlined = underlined;
  }

  public void setItalic(boolean italic) {
    this.italic = italic;
  }

  public void setBold(boolean bold) {
    this.bold = bold;
  }

  public void setVerticalAlignment(String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public void setAlignment(String horizontalAlignment) {
    this.horizonalAlignment = horizontalAlignment;
  }

}

public class Row {
  ArrayList<Cell> cells;

  public Row() {
    this.cells = new ArrayList<Cell>();
  }

  public void addCell(Cell cell) {
    this.cells.add(cell);
  }
}
