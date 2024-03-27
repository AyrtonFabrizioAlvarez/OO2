package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AdaptadorJSON {

	public Object crearJSON(Socio socio) {
		JSONObject json = new JSONObject();
		json.put("nombre", socio.getNombre());
		json.put("email", socio.getEmail());
		json.put("legajo", socio.getLegajo());
		return json;
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray json = new JSONArray();
		socios.stream().forEach(socio -> json.add(this.crearJSON(socio)));
		return json.toJSONString();
	}
}
