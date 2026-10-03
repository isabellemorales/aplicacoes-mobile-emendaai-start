package br.senai.sp.emendaai.api;

import java.util.List;

import br.senai.sp.emendaai.model.Endereco;
import br.senai.sp.emendaai.model.Feriado;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BrasilAPIService {

    @GET("feriados/v1/{ano}")
    Call<List<Feriado>> buscarFeriados(@Path("ano") int numeroAno);

    //Adicionar API
    @GET("cep/v2/{cep}")
    Call<Endereco> buscarEndereco(@Path("cep") String numeroCep);
}
