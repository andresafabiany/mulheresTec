package br.com.af.mulheresTec.response;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Response <T>{
	
	public Response(T data) {
		this.data = data;
	}
	
	private T data;
	
	private List<String> erros;

}
