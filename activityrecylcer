import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yourpackage.databinding.ActivityMainBinding // Replace with your actual package name

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Replace with your actual binding class name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) // Replace with your actual binding class name
        setContentView(binding.root)

        val recyclerView = binding.recyclerView // Replace with your actual RecyclerView ID

        val dataSet = listOf(
            YourDataModel(R.drawable.image1, "Middle Text 1", "First Text 1", "Second Text 1"),
            YourDataModel(R.drawable.image2, "Middle Text 2", "First Text 2", "Second Text 2"),
            // Add more data items as needed
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(dataSet)
        recyclerView.adapter = adapter
    }
}

