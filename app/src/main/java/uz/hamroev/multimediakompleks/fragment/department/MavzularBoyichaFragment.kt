package uz.hamroev.multimediakompleks.fragment.department

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import uz.hamroev.multimediakompleks.R
import uz.hamroev.multimediakompleks.cache.Cache
import uz.hamroev.multimediakompleks.databinding.FragmentMavzularBoyichaBinding
import xyz.teamgravity.checkinternet.CheckInternet

class MavzularBoyichaFragment : Fragment() {


    lateinit var binding: FragmentMavzularBoyichaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMavzularBoyichaBinding.inflate(layoutInflater)

        loadPdf()
        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }


        return binding.root
    }

    private fun loadPdf() {
        binding.pdfView.fromAsset("mavzu_boyicha.pdf").show()
    }


}