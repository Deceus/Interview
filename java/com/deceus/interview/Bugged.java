import java.util.*;
import java.lang.Math;

public class BuggedMainClass {

   public static void main(String[] args) {
      String previousYear = "Actual 2018";
      String currentYear = "Enacted 2019";
      String contextYear = "Analysis Recommendation 2020";
      List<String> budgetSets = Arrays.asList("Request 2020", "OMB Submit 2020", "OMB Passback 2020");

      BudgetRowClass row = new BudgetRowClass(previousYear, currentYear, contextYear, budgetSets);
      System.out.println(row);
   }
}

public class BudgetRowClass {
   String py;
   int pyValue;
   String cy;
   int cyValue;
   String context;
   int contextValue;

   List<String> bySetList;
   ArrayList<Integer> bySetValues = new ArrayList<Integer>();

   public BudgetRowClass(String py, String cy, String context, List<String> bySetList) {
      this.py = py;
      this.cy = cy;
      this.context = context;
      this.bySetList = bySetList;
      populateValues();
   }

   private void populateValues() {
      this.pyValue = generateRandomNum();
      this.cyValue = generateRandomNum();
      this.contextValue = generateRandomNum();

      for (String bySet : bySetList) {
         this.bySetValues.add(generateRandomNum());
      }

      contextValue = generateRandomNum();

   }

   private int generateRandomNum() {
      int max = 9;
      int min = 1;
      int range = max - min + 1;

      return (int) (Math.random() * range) + min;
   }

   public String toString() {
      String header = "|" + py + " | " + cy + " | ";
      for (String bySet : bySetList) {
         header += bySet + " | ";
      }
      header += context + " | \n";

      String values = "|      " + pyValue + "     |      " + cyValue + "       | ";

      for (String bySet : bySetList) {
         int i = 0;
         if (bySet.equals(context)) {
            values += bySetValues.get(i) + " | ";
         }

      }

      return header + values;
   }

}