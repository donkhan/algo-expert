package algo;

import java.util.*;

public class LowestCommonManager {

    private static List<OrgChart> getOrgReports(OrgChart topManager){
        List<OrgChart> reports = new ArrayList<>();
        for(OrgChart report : topManager.directReports){
            reports.add(report);
            reports.addAll(getOrgReports(report));
        }
        return reports;
    }

    public static OrgChart getLowestCommonManager(
            OrgChart topManager, OrgChart reportOne, OrgChart reportTwo) {
        // Write your code here.
        OrgChart r = null;

        List<OrgChart> reportOneReports = getOrgReports(reportOne);
        if(reportOneReports.contains(reportTwo)){
            return reportOne;
        }
        List<OrgChart> reportTwoReports = getOrgReports(reportTwo);
        if(reportTwoReports.contains(reportOne)){
            return reportTwo;
        }


        List<OrgChart> topManagersReports = getOrgReports(topManager);
        if(topManagersReports.contains(reportOne) && topManagersReports.contains(reportTwo)){
            r = topManager;
            for(OrgChart topManagerReport : topManagersReports){
                OrgChart tmp = getLowestCommonManager(topManagerReport,reportOne, reportTwo);
                if(tmp != null){
                    r = tmp;
                    break;
                }
            }
        }
        return r; // Replace this line.
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<OrgChart>();
        }

        // This method is for testing only.
        public void addDirectReports(OrgChart[] directReports) {
            for (OrgChart directReport : directReports) {
                this.directReports.add(directReport);
            }
        }

        public String toString(){
            return ""+name;
        }
    }

    public static void main(String args[]){
        OrgChart a = new OrgChart('A');
        OrgChart b = new OrgChart('B');
        OrgChart c = new OrgChart('C');
        OrgChart d = new OrgChart('D');
        OrgChart e = new OrgChart('E');


        OrgChart f = new OrgChart('F');
        OrgChart g = new OrgChart('G');
        OrgChart h = new OrgChart('H');
        OrgChart i = new OrgChart('I');

        OrgChart j = new OrgChart('J');
        OrgChart k = new OrgChart('K');
        OrgChart l = new OrgChart('L');
        OrgChart m = new OrgChart('M');
        OrgChart n = new OrgChart('N');
        OrgChart o = new OrgChart('O');
        OrgChart p = new OrgChart('P');
        OrgChart q = new OrgChart('Q');
        OrgChart r = new OrgChart('R');

        OrgChart s = new OrgChart('S');
        OrgChart t = new OrgChart('T');
        OrgChart u = new OrgChart('U');
        OrgChart v = new OrgChart('V');
        OrgChart w = new OrgChart('W');
        OrgChart x = new OrgChart('X');
        OrgChart y = new OrgChart('Y');
        OrgChart z = new OrgChart('Z');

        a.addDirectReports(new OrgChart[]{b,c,d,e,f});
        b.addDirectReports(new OrgChart[]{g,h,i});
        c.addDirectReports(new OrgChart[]{j});
        d.addDirectReports(new OrgChart[]{k,l});
        f.addDirectReports(new OrgChart[]{m,n});
        h.addDirectReports(new OrgChart[]{o,p,q,r});
        k.addDirectReports(new OrgChart[]{s});
        p.addDirectReports(new OrgChart[]{t,u});
        r.addDirectReports(new OrgChart[]{v});
        v.addDirectReports(new OrgChart[]{w,x,y});
        x.addDirectReports(new OrgChart[]{z});


        OrgChart result = LowestCommonManager.getLowestCommonManager(w,w,v);
        System.out.println(result.name);
    }
}
