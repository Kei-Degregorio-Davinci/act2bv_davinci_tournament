import java.util.Date;

public class Match {
        private Date date;
        private String location;
        private Team localTeam;
        private Team visitantTeam;
        private int localTeamScore;
        private int visitantTeamScore;


        // settter location
        public void setLocation(String location) {
            this.location = location;
        }


        //getter date
        public Date getDate(){
            return this.date;
        }

        //setter setDate::  (Date) -> void
        public void setDate(Date date){
            this.date = date;
            return;
        }

  /*public Date setDateAndGet(Date date) {
    this.setDate(date);
    return this.getDate();
  }*/

        //getter localTeam
        public Team getLocalTeam(){
            return this.localTeam;
        }

        //setter localTeam
        public void setLocalTeam(Team localTeam){
            this.localTeam = localTeam;
            return;
        }

        // getter visitantTeam
        public Team getVisitantTeam(){
            return this.visitantTeam;
        }

        //setter visitantTeam
        public void setVisitantTeam(Team visitantTeam){
            this.visitantTeam = visitantTeam;
            return;
        }

        // get visitanTeamScore
        public int getVisitantTeamScore(){
            return this.visitantTeamScore;
        }

        // get localTeamScore
        public int getLocalTeamScore(){
            return this.localTeamScore;
        }

        //incrementVisitantTeamScore:: void -> void
        public void incrementVisitantTeamScore(){
            this.visitantTeamScore = this.visitantTeamScore + 1;
            return;
        }

        //incrementLocalTeamScore:: void -> void
        public void incrementLocalTeamScore(){
            this.localTeamScore ++;
            return;
        }
    }
