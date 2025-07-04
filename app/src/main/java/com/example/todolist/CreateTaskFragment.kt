package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todolist.databinding.FragmentCreateTaskBinding

// TODO: Rename parameter arguments, choose names that match

class CreateTaskFragment : Fragment() {

    private var _binding: FragmentCreateTaskBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCreateTaskBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGoBack.setOnClickListener {
            findNavController().navigate(R.id.createTaskFragment_to_ToDoListFragment)
        }
        binding.CreateTaskButton.setOnClickListener {
            findNavController().navigate(R.id.createTaskFragment_to_ToDoListFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
