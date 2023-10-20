import java.util.Map;

public class Holydayzer {
  private String[][] holydays = {
    {
      "01/01/2023",
      "21/02/2023",
      "17/04/2023",
      "21/04/2023",
      "01/05/2023",
      "08/06/2023",
      "07/09/2023",
      "12/10/2023",
      "02/11/2023",
      "15/11/2023",
      "25/12/2023" 
    },
    {
      "Confraternização mundial",
      "Carnaval",
      "Páscoa",
      "Tiradentes",
      "Dia do trabalho",
      "Corpus Christi",
      "Independência do Brasil",
      "Nossa Senhora Aparecida",
      "Finados",
      "Proclamação da República",
      "Natal"
    }
  };

  public String[][] getHolydays() {
    return holydays;
  }

  String isHolyday(String date){
    String[][] holyDay = this.getHolydays();
    for(int i = 0; i<11; i++){
      if(holyDay[0][i] == date){
        return holyDay[1][i];
      }
    }
    return "Não há feriados na data informada";
  }
}
