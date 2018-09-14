package com.example;

public class MyClass {

    public static void main(String arg[]) {

        StringBuffer sqlSB = new StringBuffer();
        sqlSB.append(" SELECT  DISTINCT  (SELECT  ATTR_VAL \n");
        sqlSB.append("                                       FROM  GOM_ORDER_CAP \n");
        sqlSB.append("                                     WHERE  ORDER_ID  =  T.ORDER_ID \n");
        sqlSB.append("                                         AND  ATTR_ID  =  'SuoSJF_ID' \n");
        sqlSB.append("                                         AND  ROWNUM  =  1)  SUOSJF_ID, \n");
        sqlSB.append("                    (SELECT  ATTR_VAL \n");
        sqlSB.append("                                       FROM  GOM_ORDER_CAP \n");
        sqlSB.append("                                     WHERE  ORDER_ID  =  T.ORDER_ID \n");
        sqlSB.append("                                         AND  ATTR_ID  =  'SuoSJF' \n");
        sqlSB.append("                                         AND  ROWNUM  =  1)  SUOSJF \n");
        sqlSB.append("     FROM  GOM_WO  T \n");
        sqlSB.append("     JOIN  GOM_ORDER  O \n");
        sqlSB.append("         ON  T.ORDER_ID  =  O.ORDER_ID \n");
        sqlSB.append("     LEFT  JOIN  GOM_PS_2_WO_S  PWS \n");
        sqlSB.append("         ON  T.PS_ID  =  PWS.ID \n");
        sqlSB.append("     LEFT  JOIN  UOS_TACHE  UT \n");
        sqlSB.append("         ON  PWS.TACHE_ID  =  UT.ID \n");
        sqlSB.append("     LEFT  JOIN  GOM_PS_2_ORD_S  PS \n");
        sqlSB.append("         ON  O.PS_ID  =  PS.ID \n");
        sqlSB.append("   WHERE  T.WO_STATE  =  ").append("woStates" + "\n");
        sqlSB.append("       AND  T.DISP_OBJ_ID  = ").append("dispObjId" + "\n");
        sqlSB.append("       AND  UT.ID  =  ").append("tacheId" + "\n");
        sqlSB.append("       AND  PS.ACT_TYPE  IN  ('").append("orderActType" + "') \n");

        System.out.println(sqlSB.toString());

    }


}
