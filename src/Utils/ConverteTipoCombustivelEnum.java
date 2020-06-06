package Utils;

public class ConverteTipoCombustivelEnum {
    public static String converter(TipoCombustivelEnum valor) {
        switch(valor){
            case GasolinaComum:
                return "Gasolina Comum";
            case GasolinaAditiva:
                return "Gasolina Aditiva";
            case GasolinaPremium:
                return "Gasolina Premium";
            case GasolinaFormulada:
                return "Gasolina Formulada";
            case Etanol:
                return "Etanol";
            case EtanolAditivo:
                return "Etanol Aditivo";
            case GNV: 
                return "GNV";
            case Diesel:
                return "Diesel";
            case DieselAditivo:
                return "Diesel Aditivo";
            case DieselPremium:
                return "Diesel Premium";
        }
        return "Null";
    }
}
