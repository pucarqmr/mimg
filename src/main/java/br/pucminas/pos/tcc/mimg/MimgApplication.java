package br.pucminas.pos.tcc.mimg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@SpringBootApplication
public class MimgApplication {

	public static void main(String[] args) {
		SpringApplication.run(MimgApplication.class, args);
	}

}
