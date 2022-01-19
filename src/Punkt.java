/* klasa Punkt */

    /* stworzyć zmienne prywatne pX, pY, pZ */

    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */

    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
    public class Punkt {
        private int pX;
        private int pY;
        private int pZ;

        Punkt() {
        }

        Punkt(int pX, int pY) {
            this.pX = pX;
            this.pY = pY;

        }

        Punkt(int pX, int pY, int pZ) {
            this.pX = pX;
            this.pY = pY + pZ;
        }

        public int getpX() {
            return this.pX;
        }

        public int getpY() { return this.pY;}


        public int getpZ() {
            return this.pZ * 10;
        }

        public void setpX(int pX) {
            this.pX = pX;
        }

        public void setpY(int pY) {
           this.pY = pY;
        }

        public void setpZ(int pZ) {
            this.pX = pZ;
        }

        public int roznica() {
            return this.pX - this.pY - this.pZ;
        }

        //public int roznica() {return pX*x - pY*y - pZ*z}


        public void wyswietl() {
            System.out.println("Zmienna x: " + this.pX + ", Zmienna y: " + this.pY + ", Zmienna z: " + this.pZ);
        }


        }


