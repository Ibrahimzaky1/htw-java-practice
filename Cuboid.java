public class Cuboid{
        private Rectangle base;
        private float height;

        public Cuboid(Rectangle base, float height) {
                this.base = base;
                this.height = height;
        }

        public Rectangle getBase() {
                return base;
        }

        public void setBase(Rectangle newBase) {
                base = newBase;
        }

        public float getHeight() {return height;}

        public void setHeight(float newHeight) {
                height = newHeight;
        }

        public float calcSumEdges() {
                return 2 * base.calcCircumference() + 4 * height;
        }

        public float calcVolume() {
                return base.calcArea() * height;
        }
}