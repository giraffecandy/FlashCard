package app.babachan.flashcard

import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = Word(R.drawable.apple, "りんご" , "apple")
        val orange = Word(R.drawable.mikann, "オレンジ", "orange")
        val banana = Word(R.drawable.banana, "ばなな", "banana")
        val ichigo = Word(R.drawable.strawberry, "いちご", "strawberry")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(ichigo)
    }

    private fun addWord(word: Word) {

        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val nameTextViewE = TextView(this)
        nameTextViewE.text = word.eName

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)
        imageView.adjustViewBounds = true

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        layout.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT, 1F
        )

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(nameTextViewE)

        container.addView(layout)
    }

}