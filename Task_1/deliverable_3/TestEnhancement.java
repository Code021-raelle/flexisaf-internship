import java.lang.reflect.Method;

public class TestEnhancement {

    @EnhancementRequest(
        id = 101,
        synopsis = "Add dark mode support"
    )
    public void featureOne() {
        System.out.println("Feature one with enhancement request.");
    }

    @EnhancementRequest(
        id = 102,
        synopsis = "Improve performance",
        engineer = "Gabby",
        date = "2025-09-09"
    )
    public void featureTwo() {
        System.out.println("Feature two with assigned engineer and date.");
    }

    public static void main(String[] args) {
        // Using reflection to read annotation
        for (var method : TestEnhancement.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(EnhancementRequest.class)) {
                EnhancementRequest er = method.getAnnotation(EnhancementRequest.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  id: " + er.id());
                System.out.println("  synopsis: " + er.synopsis());
                System.out.println("  engineer: " + er.engineer());
                System.out.println("  date: " + er.date());
            }
        }
    }
}
