package dio.my_first_web_api.repository;

import dio.my_first_web_api.handler.BusinessException;
import dio.my_first_web_api.handler.CampoObrigatorioException;
import dio.my_first_web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if(usuario.getPassword()==null)
            throw new CampoObrigatorioException("password");

        if(usuario.getId()==null)
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETAR/ID - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LISTA - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("junior", "password"));
        usuarios.add(new Usuario("marcella", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/ID - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("junior", "password");
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/USERNAME - Recebendo o username: %s para localizar um usuário", username));
        return new Usuario("junior", "password");
    }
}
