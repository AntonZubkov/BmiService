public class BmiService {
    public float calculate(float height, float weight) {
        float result = weight / (height * height);
        return result;

    }

}
