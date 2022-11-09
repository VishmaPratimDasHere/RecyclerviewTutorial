import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtutorial.MainActivity
import com.example.recyclerviewtutorial.R

class MyCustomAdapter(val context: Context, val datalist: MutableList<MainActivity.Person>) : RecyclerView.Adapter<MyCustomAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // create a ViewHolder having a View object
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to the Viewholder passed
        val data=datalist[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        // Return array size
        return datalist.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name=itemView.findViewById<TextView>(R.id.tvName)
        var age=itemView.findViewById<TextView>(R.id.tvAge)

        fun bind(contact: MainActivity.Person) {
            // Bind the data in contact to the views
            name.text=contact.name
            age.text= "Age: "+contact.age.toString()
        }
    }
}