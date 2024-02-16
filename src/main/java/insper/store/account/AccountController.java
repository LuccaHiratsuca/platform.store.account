package insper.store.account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

public interface AccountController {

    @PostMapping("/account")
    public ResponseEntity<AccountOut> create(
        @RequestBody(required=true) AccountIn in
    );

    @PutMapping("/account/{id}")
    public ResponseEntity<AccountOut> update(
        @PathVariable(required=true) String id, 
        @RequestBody(required=true) AccountIn in
        );

}