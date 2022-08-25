package cl.talentoDigital.model;

import java.util.List;

public class FraseChuckNorris {
	private List<String> categories;
	private String created_at;
	private String icon_url;
	private String id ;
	private String updated_at;
	private String url;
	private String value;
	
	public FraseChuckNorris() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getCategories() {
		return categories;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getIcon_url() {
		return icon_url;
	}

	public void setIcon_url(String icon_url) {
		this.icon_url = icon_url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "FraseChuckNorris [categories=" + categories + ", created_at=" + created_at + ", icon_url=" + icon_url
				+ ", id=" + id + ", updated_at=" + updated_at + ", url=" + url + ", value=" + value + "]";
	}
	
	
	
}
