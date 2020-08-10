import java.awt.event.*
import javax.swing.*

class StudentHubGui {

    init {
        println("Opening student hub window....\n")

    }

    private lateinit var mainFrame: JFrame
    private lateinit var headerLane: JLabel
    private var statusLabel = JLabel()
    private var controlPanel = JPanel()
    private lateinit var studentNo: JLabel
    private lateinit var studentName: JLabel
    private lateinit var studentSurname: JLabel
    private lateinit var okButton: JButton
    private var studentNoTextField = JTextField(10)
    private var nameTextField = JTextField(10)
    private var surnameTextField = JTextField(10)

    fun setUpJFrame() {
        mainFrame = JFrame("Student Hub").apply {
            setSize(350, 230)

            //Object Expression

            //The object keyword can also be used to create objects of an anonymous class known as anonymous objects.
            //Here, an anonymous object is declared extending MouseAdapter class.The program overrides two MouseAdapter methods: mouseClicked() and mouseEntered().
            //anonymous object is stored in variable atheist which implements Person class with pray() method is overridden.
            addWindowListener(object : WindowAdapter() {
                override fun windowClosing(e: WindowEvent?) {
                    ////Interface method: logCloseWindow()
                    System.exit(0)
                }
            })



                    add (controlPanel)
        }
        controlPanel.layout = null

        setUpViews()
    }

    fun setUpViews() {

        //Labels and texfields add to pane
        studentNo = JLabel("Student No.")
        studentNo.setBounds(10, 20, 80, 25)
        controlPanel.add(studentNo)

        studentNoTextField.setBounds(100, 20, 165, 25)
        controlPanel.add(studentNoTextField)

        /*Numeric values only*/
        studentNoTextField.addKeyListener(object : KeyAdapter() {
            override fun keyPressed(ke: KeyEvent) {
                val value = studentNoTextField.getText()
                val l = value.length
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    studentNoTextField.setEditable(true)
                    //  label.setText("")
                } else {
                    studentNoTextField.setEditable(false)
                    // label.setText("* Enter only numeric digits(0-9)")
                }
            }
        })

        studentName = JLabel("Name")
        studentName.setBounds(10, 50, 80, 25)
        controlPanel.add(studentName)

        nameTextField.setBounds(100, 50, 165, 25)
        controlPanel.add(nameTextField)

        studentSurname = JLabel("Surname")
        studentSurname.setBounds(10, 80, 80, 25)
        controlPanel.add(studentSurname)

        surnameTextField.setBounds(100, 80, 165, 25)
        controlPanel.add(surnameTextField)

        okButton = JButton("Print Script").apply {
            actionCommand = "Print"
            setBounds(10, 130, 100, 25)
            addActionListener(ButtonClickListener())
        }

        controlPanel.add(okButton)


        statusLabel.setBounds(10, 160, 80, 25)
        controlPanel.add(statusLabel)


        mainFrame.isVisible = true
    }


    private inner class ButtonClickListener : ActionListener {
        override fun actionPerformed(e: ActionEvent) {
            statusLabel.text = when (e.actionCommand) {
                "Print" -> {
                    "Print clicked"
                }
                "Submit" -> studentName.text
                else -> "Cancel button clicked"

            }

            when (e.actionCommand) {
                "Print" -> {
//                    val student =
//                        Student(studentNoTextField.text.toInt(), nameTextField.text, surnameTextField.text, "")
//                    student.printStudentInformation(student, *student.getCourseInfo)

                }
            }
        }
    }

}


fun main() {
    val ui = StudentHubGui()
    ui.setUpJFrame()
}