package aulas.cesumar.designpatterns.builder.simples;

import java.util.Objects;

public class Livro {

	private String texto;
	private String material;
	private String registro;
	private String editora;
	private String capa;

	private Livro(String texto, String material, String registro, String editora, String capa) {
		this.texto = texto;
		this.material = material;
		this.registro = registro;
		this.editora = editora;
		this.capa = capa;
	}

	public String getTexto() {
		return texto;
	}

	public String getMaterial() {
		return material;
	}

	public String getRegistro() {
		return registro;
	}

	public String getCapa() {
		return capa;
	}

	public String getEditora() {
		return editora;
	}

	@Override
	public String toString() {
		return "Livro{" +
				"texto='" + texto + '\'' +
				", material='" + material + '\'' +
				", registro='" + registro + '\'' +
				", editora='" + editora + '\'' +
				", capa='" + capa + '\'' +
				'}';
	}

	public static Builder builder() {
		return new Builder();
	}

	public static BuilderHollow builderHollow() {
		return new BuilderHollow();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Livro livro = (Livro) o;

		if (!Objects.equals(texto, livro.texto)) return false;
		if (!Objects.equals(material, livro.material)) return false;
		if (!Objects.equals(registro, livro.registro)) return false;
		if (!Objects.equals(capa, livro.capa)) return false;
		return Objects.equals(editora, livro.editora);
	}

	@Override
	public int hashCode() {
		int result = texto != null ? texto.hashCode() : 0;
		result = 31 * result + (material != null ? material.hashCode() : 0);
		result = 31 * result + (registro != null ? registro.hashCode() : 0);
		result = 31 * result + (editora != null ? editora.hashCode() : 0);
		result = 31 * result + (capa != null ? capa.hashCode() : 0);
		return result;
	}

	public static class Builder {
		private String texto;
		private String material;
		private String registro;
		private String editora;
		private String capa;

		public Builder withTexto(String texto) {
			this.texto = texto;
			return this;
		}

		public Builder withMaterial(String material) {
			this.material = material;
			return this;
		}

		public Builder withRegistro(String registro) {
			this.registro = registro;
			return this;
		}

		public Builder withEditora(String editora) {
			this.editora = editora;
			return this;
		}

		public Builder withCapa(String capa) {
			this.capa = capa;
			return this;
		}

		public Livro build() {
			if (texto == null || material == null || registro == null || editora == null) {
				return null;
			}

			String capaDefinida = capa != null ? capa : "cor-amarela";

			return new Livro(texto, material, registro, editora, capaDefinida);
		}
	}

	public static class BuilderHollow {
		private String texto;
		private String material;
		private String registro;
		private String editora;

		public void withTexto(String texto) {
			this.texto = texto;
		}

		public void withMaterial(String material) {
			this.material = material;
		}

		public void withRegistro(String registro) {
			this.registro = registro;
		}

		public void withEditora(String editora) {
			this.editora = editora;
		}

		public Livro build() {
			return new Livro(texto, material, registro, editora, "cor-amarela");
		}
	}

}
