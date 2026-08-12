using MySql.Data.MySqlClient;
namespace Cadastro_de_clientes
{
    public partial class FormCadastro : Form
    {
        public FormCadastro()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void textBox13_TextChanged(object sender, EventArgs e)
        {

        }

        private void radioButton4_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void radioButton5_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void FormCadastro_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                SendKeys.Send("{TAB}");
                e.SuppressKeyPress = true;

            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            using (MySqlConnection Conexao = new MySqlConnection("Server=localhost;Port=3306;user id=root;password=;database=teste")) 
            {Conexao.Open();
                using(MySqlCommand cmd = Conexao.CreateCommand())
                { cmd.CommandText = "INSERT INTO clientes (nome, documentos) VALUES(@nome,@documento)";
                    cmd.Parameters.AddWithValue("@nome", "Lucas");
                    cmd.Parameters.AddWithValue("@documento", "148.420.986-94");
                    cmd.ExecuteNonQuery();

                }
                MessageBox.Show("OK");
            }
        }
    }
}
