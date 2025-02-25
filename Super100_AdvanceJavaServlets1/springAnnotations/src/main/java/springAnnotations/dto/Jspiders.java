package springAnnotations.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Jspiders {

	@Qualifier("sunilSir")
	@Autowired
	Java java;
}


/**
 * 
 * @primary -- we can give in any number of classes
 * @Qualifier -- we can give in only one class , it has more priority than @primary
 * 
 * /
 */