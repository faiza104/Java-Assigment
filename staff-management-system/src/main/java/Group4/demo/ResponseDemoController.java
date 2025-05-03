package Group4.demo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ResponseDemoController {

    // GET /success - 200 OK with custom header
    @GetMapping("/success")
    public ResponseEntity<String> successResponse() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Custom-Header", "SuccessHeader");
        return new ResponseEntity<>("Request successful!", headers, HttpStatus.OK);
    }

    // GET /not-found - 404 Not Found with error body
    @GetMapping("/not-found")
    public ResponseEntity<String> notFoundResponse() {
        String errorMsg = "The resource you are looking for was not found.";
        return new ResponseEntity<>(errorMsg, HttpStatus.NOT_FOUND);
    }

    // POST /create - 201 Created with Location header
    @PostMapping("/create")
    public ResponseEntity<String> createResource() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/new-resource/123");
        return new ResponseEntity<>("Resource created successfully.", headers, HttpStatus.CREATED);
    }
}
