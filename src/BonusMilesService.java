public class BonusMilesService {
    public int calculate(int price) {
        int result;
        int miles = 20;
        result = price / miles;
        return result;
    }
}