package sample;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class Controller {

    public Label text;
    public double memory = 0;
    public double left = 0;
    public double right = 0;
    public String operation = "";
    public boolean point = false;
    public boolean end = false;

    public void zero(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "0");
        end = false;
    }

    public void one(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "1");
        end = false;
    }

    public void two(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "2");
        end = false;
    }

    public void three(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "3");
        end = false;
    }

    public void four(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "4");
        end = false;
    }

    public void five(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "5");
        end = false;
    }

    public void six(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "6");
        end = false;
    }

    public void seven(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "7");
        end = false;
    }

    public void eight(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "8");
        end = false;
    }

    public void nine(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        text.setText(text.getText() + "9");
        end = false;
    }

    public void point(ActionEvent actionEvent) {
        if (end) {
            text.setText("");
        }
        if (!point) {
            text.setText(text.getText() + ".");
            point = true;
            end = false;
        }
    }

    public void result(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            right = Double.parseDouble(text.getText());
            switch (operation) {
                case "plus": {
                    text.setText(String.valueOf(left + right));
//                    System.out.println(left + " plus " + right);
                    break;
                }
                case "minus": {
                    text.setText(String.valueOf(left - right));
//                    System.out.println(left + " minus " + right);
                    break;
                }
                case "multiply": {
                    text.setText(String.valueOf(left * right));
//                    System.out.println(left + " multiply " + right);
                    break;
                }
                case "division": {
                    if (right == 0) {
                        text.setText("Деление на ноль невозвожно");
                    } else {
                        text.setText(String.valueOf(left / right));
//                        System.out.println(left + " division " + right);
                    }
                    break;
                }
                case "percent": {
                    text.setText(String.valueOf(left * (right / 100)));
//                    System.out.println(left + " percent " + right);
                    break;
                }
            }
            end = true;
            operation = "";
        }
    }

    public void plus(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            left = Double.parseDouble(text.getText());
            text.setText("");
            operation = "plus";
            point = false;
//            System.out.println("left: " + left);
        }
    }

    public void minus(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            left = Double.parseDouble(text.getText());
            text.setText("");
            operation = "minus";
            point = false;
//            System.out.println("left: " + left);
        }
    }

    public void multiply(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            left = Double.parseDouble(text.getText());
            text.setText("");
            operation = "multiply";
            point = false;
//            System.out.println("left: " + left);
        }
    }

    public void division(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            left = Double.parseDouble(text.getText());
            text.setText("");
            operation = "division";
            point = false;
//            System.out.println("left: " + left);
        }
    }

    public void percent(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            left = Double.parseDouble(text.getText());
            text.setText("");
            operation = "percent";
            point = false;
//            System.out.println("left: " + left);
        }
    }

    public void fractions(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            if (Double.parseDouble(text.getText()) == 0) {
                text.setText("Деление на ноль невозвожно");
            } else {
                text.setText(String.valueOf(1 / Double.parseDouble(text.getText())));
            }
            end = true;
            point = false;
            operation = "";
//            System.out.println("left: " + left);
        }
    }

    public void changeSign(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            text.setText(String.valueOf(Double.parseDouble(text.getText()) * (-1)));
            end = true;
            point = false;
            operation = "";
//            System.out.println("left: " + left);
        }
    }

    public void sqrt(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            if (Double.parseDouble(text.getText()) >= 0) {
                text.setText(String.valueOf(Math.sqrt(Double.parseDouble(text.getText()))));
            } else {
                text.setText("Недопустимый ввод");
            }
            end = true;
            point = false;
            operation = "";
//            System.out.println("left: " + left);
        }
    }

    public void clear(ActionEvent actionEvent) {
        left = right = 0;
        text.setText("");
        point = false;
        operation = "";
//        System.out.println("left: " + left);
    }

    public void clearEntry(ActionEvent actionEvent) {
        text.setText("");
        point = false;
//        System.out.println("left: " + left);
    }

    public void back(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            text.setText(text.getText().substring(0, text.getText().length() - 1));
            point = false;
        }
    }

    public void memorySave(ActionEvent actionEvent) {
        if (!text.getText().isEmpty()) {
            memory = Double.parseDouble(text.getText());
            end = true;
//            System.out.println("memory: " + memory);
        }
    }

    public void memoryRead(ActionEvent actionEvent) {
        text.setText(String.valueOf(memory));
        end = true;
        point = false;
    }

    public void memoryClear(ActionEvent actionEvent) {
        memory = 0;
    }

    public void memoryPlus(ActionEvent actionEvent) {
        memory += Double.parseDouble(text.getText());
        end = true;
//        System.out.println("memory: " + memory);
    }

    public void memoryMinus(ActionEvent actionEvent) {
        memory -= Double.parseDouble(text.getText());
        end = true;
//        System.out.println("memory: " + memory);
    }
}
