package calculoimc;

public class Imc {
    
    public double calcular(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public String situacaoImc(double peso, double altura) {
        
        double imc = this.calcular(peso, altura);
        String situacao = "";
        
        if (imc < 18.5) {
            situacao = "Abaixo do peso";
        } else if (imc >= 18.5 & imc < 24.9) {
            situacao = "Peso normal";
        } else if (imc >= 24.9 & imc <= 29.9) {
            situacao = "Sobrepeso";
        } else if (imc >= 30 & imc <= 34.9) {
            situacao = "Obesidade Grau I";
        } else if (imc >= 35 & imc <= 39.9) {
            situacao = "Obesidade Grau II";
        } else if (imc >= 40) {
            situacao = "Obesidade Grau III";
        }
        
        return situacao;
    }
    
}