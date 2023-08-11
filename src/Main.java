public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5.0);
        FiguraGeometrica rectangulo = new Rectangulo(4.0, 3.0);
        FiguraGeometrica triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
    }
}
