@RestController
@RequestMapping("/api/planning")
public class PlanningController {

    @PostMapping("/execute")
    public String executePlanning() {
        return "Planning executed successfully";
    }
}
